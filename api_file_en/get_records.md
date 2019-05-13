# Inquire K-line data
- request method: GET
- url: https://{host}/open/api/get_records
- input parameter 
```
symbol={symbol}&period={period}
```
- entry instructions

  | the field names | type of data | instructions |
  | --- | -coin pair | * |
  | period | type | 1、5、15、30、60 (minutes) |
command
```
curl -X GET https://{host}/open/api/get_records?symbol=mkreth\&period=1
```

- return information

    | the field names | type of data | instructions |
    | --- | --- | --- |
    | code | code | 0=succeed，otherwise fail |
    | msg | content | suc=succeed，otherwise return to specific information |
    | data | time、open、high、low、close、vol | |
    
- 示例
```
{
	"code": "0",
	"msg": "suc",
	"data": [
		[1554170160, 89.00000000, 89.00000000, 89.00000000, 89.00000000, 0]
	]
}
```
