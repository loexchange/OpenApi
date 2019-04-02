# 查询所有行情数据
- 请求方式: GET
- url: https://{host}/open/api/get_allticker
- 传入参数 
```
无
```

- 命令
```
curl -X GET https://{host}/open/api/get_allticker
```

- 返回信息

    | 字段名 | 数据类型 | 说明 |
    | --- | --- | --- |
    | code | 编码 | 0=成功，否则失败 |
    | msg | 内容 | suc=成功，否则返回具体信息 |
    
- 示例
```
{
	"code": "0",
	"msg": "suc",
	"data": {
		"date": 1554188796933,
		"ticker": [{
			"symbol": "mkreth",
			"high": 89.0,
			"vol": 0.0,
			"last": "89.0000000000000000",
			"low": 89.0,
			"buy": "50.55000000",
			"rose": 0.0
		}]
	}
}
```
