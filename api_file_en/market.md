# Query the latest transaction price of all coins
- request mrthod: GET
- url: https://{host}/open/api/market
- input parameter 
```
api_key={api_key}&time={time}&sign={sign}
```
- entry instruction

  | the field names | type of data | instructions |
  | --- | --- | --- |
  | api_key | interface key | * |
  | sign | signature data | * |
  | time | current timestamp | * |

- command
```
curl -X GET https://{host}/open/api/market?api_key=1764ddfe62ab365092296ad8272df4f9\&sign=f12a311f9d0afa0e4e7dd6c6c65aeb66\&time=1554189132
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
		"btcusdt": 3800.0,
		"mkrbtc": 0.177235,
		"ethbtc": 0.035456
	}
}
```
