

----------------操作类--------------
1、将web文件夹改名为webapp并拷贝到src/main/下（intellij添加的web支持目录在打war包时不可用，即存放位置不对）
2、将mapping文件夹下的配置文件拷贝到resources/com/szb/mapping/(配置文件最终打war包时会丢失，且在该目录下才可正常工作)
3、将spring-mvc.xml文件中MappingJacksonHttpMessageConverter替换为MappingJackson2HttpMessageConverter
    因为spring3和spring4处理json方法不一样了
4、数据库配置文件中连接串要加时区信息，但是加哪个时区待定（暂定UTC），时区可以根据自己数据库的设定来设置（GMT/UTC ）
5、问题：在编辑一个Service中注入mapper会提示could not autowire
    解决：file->settings->spring->serverity->改为warning
6、修改intellij主题颜色：file->settings->editor->color&fonts->scheme->下面就是可选项
7、数据仓库地址<mirrors> <mirror> <id>alimaven</id> <name>aliyun maven</name> <url>http://maven.aliyun.com/nexus/content/groups/public/</url> <mirrorOf>central</mirrorOf> </mirror> </mirrors>
	也可以选择：
	<mirror>
      <id>UK</id>
      <mirrorOf>central</mirrorOf>
      <name>UK Central</name>
      <url>http://uk.maven.org/maven2</url>
    </mirror>
8、jdbc.properties、log4j.properties、spring-mvc.xml、spring-mybatis.xml这几个配置文件要手工放到类路径下
9、servlet-api.jar jsp-api.jar 在maven引入是scope可以选择test
------------方法及字段的设计---------------------
一、用户
	增：insert(User user)
		字段（10个）包括：
				自动生成（1个）：主键（UUID也可用于收款码地址、头像地址等的文件名）
				关注获取（1个）：微信号
				手工录入（5个）：姓名，手机号，公司/店铺名称，公司/店铺地址，家庭住址
				系统生成（2个）：收款码地址，头像地址
				供用户选择（1个）：用户类型（买家/卖家）
	删：deleteByChatId(User user)
		彻底删除（即delete）
	改：updateByChatIdSelective(User user)
		只更新已设置值的字段(除主键、微信号均可修改)
	查：selectByChatId(User user)
二、账单
	增：insert(Record record)
		字段（11个）包括：
				自动生成（1个）：主键（UUID）
				系统生成（3个）：账单流水号，账单发生时间，还款时间
				系统获取（1个）：买家chatId
				系统更新（2个）：还款状态，买家确认状态
				商家填写（4个）：商品名称，商品数量，商品总金额，应还款日
	删：deleteByHostChatIdAndFloatNum(Record record)
		方案，方案一：
						彻底删除（即delete，暂时采用方案一）
	改：updateByHostChatIdAndFloatNumSelective(Record record)用于商家更新还款状态
		只更新已设置值的字段
	查：
		selectByHostChatIdAndPaymentStatus(Record record)用于卖家展示待收账款/已收账款
		selectByHostChatIdAndFloatNum(Record record)用于卖家查看账单详情

		selectByCustChatIdAndPaymentStatus(Record record)用于买家展示待支付/已支付

-------------备用备注-----------------------------

	1、手工删除pojo中的对ID的setter方法
	2、命令行创建maven项目mvn archetype:generate -DgroupId=com.szb -DartifactId=shezhangbao -DarchetypeArtifactId=maven-archetype-webapp -DinteractivMode=false

-----------------实现进度-------------------
1、采用intellij开发工具，用spring、springMVC、mybatis技术，MySQL数据库，从前端jsp到后端再到数据库，已经基本成型。

----------------待确认---------------

1、接口方法的确定，重点在用户及账单删除时是否永久删除，如果不永久删除需要添加是否可用的状态字段visable。
2、字段是否需要修改或添加
3、表是否需要添加或拆分或修改表结构
3、mybatis的dao层参数全部用实体（User、Record）是否可行，即是否影响查询效率尚不明确，但采用实体比较便捷。
4、qin具体开发到哪一层，是到service层么？
5、service层需要用到什么方法，即传什么参数，多重服用还是随参数个数确定。
6、HTML与service如何衔接（qin尚不明确）
7、确认intellij、MySQL、spring、maven版本及各种jar报版本
8、如何存储二维码（数据库or磁盘）


