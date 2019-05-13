# Query the depth of order 
- request method: GET
- url: https://{host}/open/api/market_dept
- input parameter 
```
symbol={symbol}&type={type}
```
- entry instruction

  | the field names | type of data | instructions |
  | --- | --- | --- |
  | symbol | coin pair | * |
  | type | type | *step0、step1、step2 |

- command
```
curl -X GET https://{host}/open/api/market_dept?symbol=mkreth\&type=step0
```

- return information

    | the field names | type of data | instructions |
    | --- | --- | --- |
    | code | code | 0=succeed，otherwise fail |
    | msg | content | suc=succeed，otherwise return to specific information |
    
- example
```
{
	"code": "0",
	"msg": "suc",
	"data": {
		"tick": {
			"asks": [],
			"bids": [
				["50.55000000", 0.50000000],
				["31.00000000", 1.00000000],
				["30.00000000", 0.90000000],
				["29.00000000", 0.40000000],
				["14.00000000", 0.44340000]
			],
			"time": null
		}
	}
}
```
