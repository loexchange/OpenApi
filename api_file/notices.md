# 查询公告列表
- 请求方式: GET
- url: https://{host}/open/api/notices/list
- 传入参数 
```
api_key={api_key}&time={time}&sign={sign}&symbol={symbol}
```
- 入参说明

  | 字段名称 | 数据类型 | 说明 |
  | --- | --- | --- |
  | pageSize | 查询数量 | 非必传 |
  | page | 页码 | 非必传 |
  | lang | 语言 | zh, en 非必传 |

- 命令
```
curl -X GET https://{host}/open/api/notices/list?page=1\&pageSize=1\&lang=zh
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
	"data": [{
		"timeLong": 1554090795000,
		"id": 12,
		"title": "标题",
		"lang": "zh",
		"content": "内容"
	}]
}
```
