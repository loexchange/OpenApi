# 查询盘口深度
- 请求方式: GET
- url: https://open.loex.io/open/orderbook
- 传入参数
	?market_pair=BTC_LCNY

- 入参说明

  | 字段名称 | 数据类型 | 说明 |
  | --- | --- | --- |
  | market_pair | 币对 | BTC_LCNY |
  | depth‌ | 深度数量 | [0,5,10,20,50,100,500] |

- 命令
```
curl -X GET https://open.loex.io/open/orderbook?market_pair=BTC_LCNY
```

- 返回信息

    | 字段名 | 数据类型 | 说明 |
    | --- | --- | --- |
    | code | 编码 | 0=成功，否则失败 |
    | message | 内容 | suc=成功，否则返回具体信息 |
    | data | 返回对象 | * |


# 查询行情
- 请求方式: GET
- url: https://open.loex.io/open/ticker
- 传入参数
	

- 命令
```
curl -X GET https://open.loex.io/open/ticker
```

- 返回信息

    | 字段名 | 数据类型 | 说明 |
    | --- | --- | --- |
    | code | 编码 | 0=成功，否则失败 |
    | message | 内容 | suc=成功，否则返回具体信息 |
    | data | 返回对象 | * |


# 查询币种信息
- 请求方式: GET
- url: https://open.loex.io/open/assets
- 传入参数
	

- 命令
```
curl -X GET https://open.loex.io/open/assets
```

- 返回信息

    | 字段名 | 数据类型 | 说明 |
    | --- | --- | --- |
    | code | 编码 | 0=成功，否则失败 |
    | message | 内容 | suc=成功，否则返回具体信息 |
    | data | 返回对象 | * |


# 查询币种信息
- 请求方式: GET
- url: https://open.loex.io/open/trades
- 传入参数
	
- 入参说明

  | 字段名称 | 数据类型 | 说明 |
  | --- | --- | --- |
  | market_pair | 币对 | BTC_LCNY |
  | type | 类型 | SELL,BUY |

- 命令
```
curl -X GET https://open.loex.io/open/trades
```

- 返回信息

    | 字段名 | 数据类型 | 说明 |
    | --- | --- | --- |
    | code | 编码 | 0=成功，否则失败 |
    | message | 内容 | suc=成功，否则返回具体信息 |
    | data | 返回对象 | * |
