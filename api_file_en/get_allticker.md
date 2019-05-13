# Query all market data
- request method: GET
- url: https://{host}/open/api/get_allticker
- input parameter 
```
None
```

- command
```
curl -X GET https://{host}/open/api/get_allticker
```

-return information

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
