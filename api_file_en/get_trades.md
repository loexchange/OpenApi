# Check the transaction record
- request method: GET
- url: https://{host}/open/api/get_trades
- input parameter 
```
symbol={symbol}
```
- entry instruction

  | the field names | type of data | instructions |
  | --- | ---coin pair | * |
command
```
curl -X GET https://{host}/open/api/get_trades?symbol=mkreth
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
	"data": [{
		"amount": 5.0000000000000000,
		"price": 89.0000000000000000,
		"id": 52,
		"type": "sell"
	}]
}
```
