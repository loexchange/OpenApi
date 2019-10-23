<?php

    /**
     * 签名规则
     * @param $data array
     * @param $secret  加密字符串
     * @return mixed
     */
    function getSion($data,$secret){
        if(!is_array($data)){
            return false;
        }

        //组装数据
        $string = formatBizQueryParaMap($data, false);
 
        //加密
        $sign = md5($string.$secret);

        return $sign;
    }

    function formatBizQueryParaMap($data,$urlencode=false){
        ksort($data);
        $buff = '';
        foreach ($data as $k=>$v){
            if($urlencode){
                $v = urlencode($v);
            }
            $buff .= $k . $v . '&';
        }
        $str = '';
        if (strlen($buff) > 0)
        {
            $str = substr($buff, 0, strlen($buff)-1);
        }
        return $str;
    }

?>