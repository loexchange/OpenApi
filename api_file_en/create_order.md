# Creat order
- request method: GET
- url: https://{host}/open/api/create_order
- input parameter 
```
volume={volume}&symbol={symbol}&side={side}&api_key={api_key}&price={price}&sign={sign}&time={time}&type={type}
```
- entry instructions

  | the field names | type of data | instructions |
  | --- | --- | --- |
  | api_key | interface key | * |
  | sign | signature data | * |
  | symbol | coin pair | * |
  | time | current timestamp | * |
  | volume | volume | * |
  | side | transaction | * BUY or SELL |
  | type | type of pending order | 1:limited trading 2:market trading
 
 |
  | price | price | when type=2 it is not required |

- command
```
curl -X POST https://{host}/open/api/create_order?api_key=1764ddfe62ab365092296ad8272df4f9\&volume=0.1\&symbol=mkreth\&side=BUY\&price=0.01\&sign=127b510d23c101501fe767db42b6de4b\&time=1554186684\&type=1
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
