USE [PAS]
GO
/****** Object:  Table [dbo].[black_list]    Script Date: 2/22/2014 12:39:29 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[black_list](
	[BID] [int] NULL,
	[PID] [varchar](50) NULL,
	[reason] [varchar](50) NULL,
	[des] [varchar](50) NULL
) ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[encript_table]    Script Date: 2/22/2014 12:39:29 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[encript_table](
	[id] [int] IDENTITY(1,1) NOT NULL,
	[user_id] [varchar](50) NULL,
	[image] [varbinary](max) NULL,
 CONSTRAINT [PK_encript_table] PRIMARY KEY CLUSTERED 
(
	[id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[login_table]    Script Date: 2/22/2014 12:39:29 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[login_table](
	[username] [varchar](50) NULL,
	[password] [varchar](50) NULL,
	[role] [varchar](50) NULL,
	[status] [int] NULL,
	[description] [varchar](50) NULL
) ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[message_table]    Script Date: 2/22/2014 12:39:29 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[message_table](
	[ID] [int] IDENTITY(1,1) NOT NULL,
	[sender] [varchar](50) NULL,
	[receiver] [varchar](50) NULL,
	[status] [varchar](100) NULL,
	[subject] [varchar](100) NULL,
	[message] [varchar](100) NULL,
	[attach] [varbinary](max) NULL,
	[date] [varchar](100) NULL
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[passoffice_table]    Script Date: 2/22/2014 12:39:29 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[passoffice_table](
	[PASOFID] [int] NULL,
	[pasofname] [varchar](100) NULL
) ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[signature_table]    Script Date: 2/22/2014 12:39:29 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[signature_table](
	[UID] [int] IDENTITY(1,1) NOT NULL,
	[type] [varchar](50) NULL,
	[countrycode] [varchar](100) NULL,
	[passportno] [varchar](100) NULL,
	[placeofissue] [varchar](100) NULL,
	[dateofissue] [varchar](50) NULL,
	[dateofexpiry] [varchar](50) NULL,
	[signature] [varbinary](max) NULL,
	[uname] [varchar](100) NULL,
 CONSTRAINT [PK_signature_table] PRIMARY KEY CLUSTERED 
(
	[UID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[user_table]    Script Date: 2/22/2014 12:39:29 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[user_table](
	[PID] [int] IDENTITY(1,1) NOT NULL,
	[passoff] [varchar](100) NULL,
	[name] [varchar](100) NULL,
	[surname] [varchar](100) NULL,
	[dob] [varchar](100) NULL,
	[pob] [varchar](100) NULL,
	[pnationality] [varchar](100) NULL,
	[qualification] [varchar](100) NULL,
	[profession] [varchar](100) NULL,
	[gender] [varchar](50) NULL,
	[fname] [varchar](100) NULL,
	[fnationality] [varchar](100) NULL,
	[mname] [varchar](100) NULL,
	[mnationality] [varchar](100) NULL,
	[martial] [varchar](100) NULL,
	[sname] [varchar](100) NULL,
	[snationality] [varchar](100) NULL,
	[address] [varchar](200) NULL,
	[taluk] [varchar](100) NULL,
	[district] [varchar](100) NULL,
	[state] [varchar](100) NULL,
	[pin] [int] NULL,
	[caddress] [varchar](200) NULL,
	[ctaluk] [varchar](100) NULL,
	[cdistrict] [varchar](100) NULL,
	[cstate] [varchar](100) NULL,
	[cpin] [int] NULL,
	[mail] [varchar](100) NULL,
	[login_id] [varchar](100) NULL,
	[pwd] [varchar](100) NULL,
	[cpwd] [varchar](100) NULL,
	[hintq] [varchar](100) NULL,
	[hinta] [varchar](100) NULL,
	[contact] [varchar](100) NULL,
	[status] [varchar](50) NULL,
	[description] [varchar](500) NULL,
	[crypto_source] [varbinary](50) NULL,
	[crypto_dest] [varbinary](50) NULL,
	[crypto_algo] [varchar](50) NULL,
	[crypto_orginal] [varbinary](50) NULL,
	[secretimage] [varbinary](max) NULL,
	[photo] [varbinary](max) NULL,
	[identify_mark1] [varchar](100) NULL,
	[identify_mark2] [varchar](100) NULL,
 CONSTRAINT [PK_user_table_1] PRIMARY KEY CLUSTERED 
(
	[PID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
