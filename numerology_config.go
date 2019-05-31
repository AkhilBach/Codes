package main


import("fmt";"math")

type Numerology_Config struct{
Subcarrier_Spacing int
Numerology int
Ts int
Tc int
Tf int
Tsf int
Fc int
BW int
Slots_in_Subframe int
Subframe_in_Frame int
Symbols_in_SLot int
Subcarrier_in_Slot int
Bandwidth int
CP_Duration int
Symbol_Duration int
OFDM_Duration int
Slot_Length int
Slots_in_Frame int
Fmax int
Fref int
Nfft int
Nref int
Symbols_in_Subframe int

}

func NR_Config(int Space,int Fc,int BW)*Numerology_Config{
  res=new(Numerology_Config)
  res.Subcarrier_Spacing=Space
  res.Numerology=Log2(Space/15*10^3)
  res.Fmax=480*10^3
  res.Fref=15*10^3
  res.Nfft=4096
  res.Nref=2048
  res.Fc=Fc
  res.BW=BW
  res.Ts=1/(res.Fmax*res.Nfft)
  res.Tc=1/(res.Fref*res.Nref)
  res.Tf=(res.Fmax*res.Nfft*res.Tc)/100
  res.Tsf=(res.Fmax*res.Nfft*res.Tc)/1000
  res.Slots_in_Subframe=2^(res.Numerology)
  res.Subframe_in_Frame=res.Tf/res.Tsf
  res.Symbols_in_SLot=14
  res.Subcarrier_in_Slot=12
  res.Bandwidth=Space*res.Subcarrier_in_Slot
  //res.CP_Duration=
  res.Symbol_Duration=1/Space
  //res.OFDM_Duration=
  res.Slot_Length=res.Tsf/res.Slots_in_Subframe
  res.Slots_in_Frame=res.Slots_in_Subframe*res.Subframe_in_Frame
  res.Symbols_in_Subframe=res.Symbols_in_SLot*res.Slots_in_Subframe


  return res

}

func main(){
 result=new(Numerology_Config)
 //result=:Numerology_Config{}
 var Fc int=4*10^9
 var Bw int=20*10^6
 var Space int=15*10^3
 result=NR_Config(Space,Fc,BW)
 fmt.Println(result.Fmax)
}
