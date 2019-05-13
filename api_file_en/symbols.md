# Query open information of coiny pair 
- request method: GET
- url: `https://{host}/open/api/common/symbols`
- input parameter   `none`
- return information

    | the field names | type of data | instructions |
    | --- | --- | --- |
    | code | code | 0=succeed，otherwise fail |
    | msg | content | suc=succeed，otherwise return to specific information |
    | symbol | coin pair | consist of basecoin and countcoin |
    | count_coin | coin based on quantity | the seller's coin |
    | base_coin | coin based on price | the buyer's coin |
- command
```
curl -X GET http://{host}/open/api/common/symbols
```

- example
```
{
	"code": "0",
	"msg": "suc",
	"data": [{
		"symbol": "ethlcny",
		"count_coin": "LCNY",
		"amount_precision": 4,
		"base_coin": "ETH",
		"price_precision": 8
	}, {
		"symbol": "btclcny",
		"count_coin": "LCNY",
		"amount_precision": 8,
		"base_coin": "BTC",
		"price_precision": 8
	}]
}
```
