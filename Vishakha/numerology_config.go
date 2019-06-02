package main

import (
	"fmt"
	"math"
)

type Numerology_Config struct {
	Subcarrier_Spacing  float64
	Numerology          float64
	Ts                  float64
	Tc                  float64
	Tf                  float64
	Tsf                 float64
	Fc                  float64
	BW                  float64
	Slots_in_Subframe   float64
	Subframe_in_Frame   float64
	Symbols_in_SLot     float64
	Subcarrier_in_Slot  float64
	Bandwidth           float64
	CP_Duration         float64
	Symbol_Duration     float64
	OFDM_Duration       float64
	Slot_Length         float64
	Slots_in_Frame      float64
	Fmax                float64
	Fref                float64
	Nfft                float64
	Nref                float64
	Symbols_in_Subframe float64
}

func NR_Config(Space float64, Fc float64, BW float64) *Numerology_Config {
	var res = new(Numerology_Config)
	res.Subcarrier_Spacing = Space

	res.Numerology = math.Log2(res.Subcarrier_Spacing / 15000)
	res.Fmax = 480 * 1000
	res.Fref = 15 * 1000
	res.Nfft = 4096
	res.Nref = 2048
	res.Fc = Fc
	res.BW = BW
	res.Ts = 1 / (res.Fmax * res.Nfft)
	res.Tc = 1 / (res.Fref * res.Nref)
	res.Tf = (res.Fmax * res.Nfft * res.Tc) / 100
	res.Tsf = (res.Fmax * res.Nfft * res.Tc) / 1000
	res.Slots_in_Subframe = math.Pow(2, (res.Numerology))
	res.Subframe_in_Frame = res.Tf / res.Tsf
	res.Symbols_in_SLot = 14
	res.Subcarrier_in_Slot = 12
	res.Bandwidth = Space * res.Subcarrier_in_Slot
	//res.CP_Duration=
	res.Symbol_Duration = 1 / Space
	//res.OFDM_Duration=
	res.Slot_Length = res.Tsf / res.Slots_in_Subframe
	res.Slots_in_Frame = res.Slots_in_Subframe * res.Subframe_in_Frame
	res.Symbols_in_Subframe = res.Symbols_in_SLot * res.Slots_in_Subframe

	return res

}

func main() {

	Fc := 4 * math.Pow(10, 9)
	BW := 20 * math.Pow(10, 6)
	Space := 15 * math.Pow(10, 3)
	result := NR_Config(Space, Fc, BW)
	fmt.Println("Subcarrier Spacing:", result.Subcarrier_Spacing, "\nNumerology:", result.Numerology, "\nFmax", result.Fmax, "\nFref", result.Fref, "\nNfft", result.Nfft, "\nNref", result.Nref, "\nFc", result.Fc, "\nBW", result.BW, "\nSlots_in_Subframe", result.Slots_in_Subframe, "\nSubframe_in_Frame", result.Subframe_in_Frame, "\nSymbols_in_SLot", result.Symbols_in_SLot, "\nSubcarrier_in_Slot", result.Subcarrier_in_Slot, "\nBandwidth", result.Bandwidth, "\nSymbol_Duration", result.Symbol_Duration, "\nSlot_Length", result.Slot_Length, "\nSlots_in_Frame", result.Slots_in_Frame, "\nSymbols_in_Subframe", result.Symbols_in_Subframe, "\nTc", result.Tc, "\nTs", result.Ts, "\nTf", result.Tf, "\nTsf", result.Tsf)
}
