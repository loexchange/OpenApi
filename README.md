# 雷盾交易所公共接口文档[(English)](README_EN.md)
* 官网地址https://www.loex.io
* 调用接口域名 open.loex.io


### 接口列表
* [/open/api/market_dept](api_file/market_dept.md) 查询买卖盘深度
* [/open/api/market](api_file/market.md)          查询所有币对最新成交价
* [/open/api/get_trades](api_file/get_trades.md)      查询成交记录
* [/open/api/get_allticker](api_file/get_allticker.md)   查询所有行情数据
* [/open/api/get_ticker](api_file/get_ticker.md)      查询币对行情
* [/open/api/get_records](api_file/get_records.md)     查询K线数据
* [/open/api/notices/list](api_file/notices.md)    查询公告
* [/open/api/create_order](api_file/create_order.md)    创建订单
* [/open/api/cancel_order](api_file/cancel_order.md)    取消订单
* [/open/api/cancel_order_all](api_file/cancel_order_all.md)  取消全部订单
* [/open/api/all_order](api_file/all_order.md)       查询已创建订单
* [/open/api/all_trade](api_file/all_trade.md)      查询成交记录
* [/open/api/new_order](api_file/new_order.md)      查询当前订单
* [/open/api/order_info](api_file/order_info.md)     查询订单详情
* [/open/api/common/symbols](api_file/symbols.md) 查询所有币对
* [/open/api/user/account](api_file/account.md)   查询个人资产

### 全局返回code说明
| 状态码 | 说明 |
| --- | --- |
| 110042 | 访问受限，请联系客服 |
| 101 | 请求量受限，受全局访问与单用户访问限制 |
| MISS_API_KEY | 缺少api_key参数，可在www.loex.io申请 |
| MISS_SIGN | 缺少签名参数 |
| MISS_TIMESTAMP | 缺少time参数，精确到秒 |
| SIGN_EXPIRED | 签名以过期，time时间必须为当前unix时间戳，精确到秒 |
| Fail | symbol access not allowed，申请api时，需要授权币对 |

