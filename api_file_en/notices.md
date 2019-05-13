# Query announcement list
- request method: GET
- url: https://{host}/open/api/notices/list
- input parameter  
```
api_key={api_key}&time={time}&sign={sign}&symbol={symbol}
```
- entry instruction

  | the field names | type of data | instructions |
  | --- | --- | --- |
  | pageSize | number of queries | not required |
  | page | page number | not required |
  | lang | language | zh, en not required |

- command
```
curl -X GET https://{host}/open/api/notices/list?page=1\&pageSize=1\&lang=zh
```
- return information

    | the field names | type of data | instructions |
    | --- | --- | --- |
    | code | code | 0=succeed，otherwise fail |
    | msg | content | suc=succeed，otherwise return to specific information |
  example
```
{
	"code": "0",
	"msg": "suc",
	"data": [{
		"timeLong": 1554090795000,
		"id": 12,
		"title": "title",
		"lang": "zh",
		"content": "content"
	}]
}
```
