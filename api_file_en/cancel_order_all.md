# Cancel all orders
- request method: POST
- url: https://{host}/open/api/cancel_order_all
- input parameter  
```
api_key={api_key}&time={time}&sign={sign}&symbol={symbol}
```
- entry instructions

  | the field names | type of data | instructions |
  | --- | --- | --- |
  | api_key | interface key | * |
  | sign | signature data | * |
  | symbol | coin pair | * |
  | time | current timestamp | * |

- command
```
curl -X POST https://localhost:8080/exchange-open-api/open/api/cancel_order_all?api_key=1764ddfe62ab365092296ad8272df4f9\&sign=e432bf3286e8af7f65a7957f8b659dc3\&time=1554185838\&symbol=mkreth
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
	"data": null
}
```
