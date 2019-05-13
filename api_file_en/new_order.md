#Query the current order
- request: GET
- url: https://{host}/open/api/new_order
- input parameter 
```
api_key={api_key}&time={time}&sign={sign}&symbol={symbol}
```
- entry instruction

  | the field names | type of data | instructions |
  | --- | --- | --- |
  | api_key | interface key | * |
  | sign | signature data | * |
  | symbol | coin pair | * |
  | time | current timestamp | * |
  | pageSize | number of queries | not required |
  | page | page number | not required |

- command
```
curl -X GET httpss://{host}/open/api/new_order?api_key=1764ddfe62ab365092296ad8272df4f9\&sign=266a90452a352a1c674df2e0b18cc9e9\&time=1554184381\&symbol=mkreth\&pageSize=10\&page=1
```

- return information

    | the field names | type of data | instructions |
    | --- | --- | --- |
    | code | | the field names | type of data | instructions |
    | msg | content | suc=succeed，otherwise return to specific information |
    | total_price | total order | &nbsp; |
    | deal_volume | number of transactions | &nbsp; |
    | btcValuatin | conversion asset | assets converted into BTC |
    | locked | frozen asset  | frozen assets that cannot be used |
    | coin | coin | &nbsp; |
    
- example
```
{
	"code": "0",
	"msg": "suc",
	"data": {
		"count": 1,
		"resultList": [{
			"side": "SELL",
			"total_price": "890.00000000",
			"created_at": 1553855047000,
			"avg_price": "89.00000000",
			"countCoin": "ETH",
			"source": 1,
			"type": 1,
			"side_msg": "sell out",
			"volume": "10.00000000",
			"price": "89.00000000",
			"source_msg": "WEB",
			"status_msg": "partial deal",
			"deal_volume": "5.00000000",
			"id": 115,
			"remain_volume": "5.00000000",
			"baseCoin": "MKR",
			"tradeList": [{
				"volume": "5.00000000",
				"feeCoin": "ETH",
				"price": "89.00000000",
				"fee": "0.00000000",
				"ctime": 1553808247001,
				"deal_price": "445.00000000",
				"id": 52,
				"type": "sell out"
			}],
			"status": 3
		}]
	}
}
```
