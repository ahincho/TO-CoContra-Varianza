Class {
	#name : #Main,
	#superclass : #Object,
	#category : #CodigoPharo
}

{ #category : #variance }
Main >> casosContravarianza [
	| a b c y myA myB myC |
	Transcript show: 'Casos Contravarianza.'; cr.
	a := A new.
	b := B new.
	c := C new.
	y := Y new.
	myA := A new.
	myB := B new.
	myC := C new.
	myB := y contraVarianzaCB: c.
	myB := y contraVarianzaCA: c.
	myA := y contraVarianzaBA: b.
	
]

{ #category : #variance }
Main >> casosCovarianza [
	| a b c y myA myB myC |
	Transcript show: 'Casos Covarianza.'; cr.
	a := A new.
	b := B new.
	c := C new.
	y := Y new.
	myA := A new.
	myB := B new.
	myC := C new.
	myA := y covarianzaAB: b.
	myA := y covarianzaAC: c.
	myB := y covarianzaBC: c.
	
]

{ #category : #variance }
Main >> casosNormales [
	| a b c x myA myB myC |
	Transcript show: 'Casos Normales.'; cr.
	a := A new.
	b := B new.
	c := C new.
	x := X new.
	myA := A new.
	myB := B new.
	myC := C new.
	myA := x invarianzaA: a.
	myB := x invarianzaB: b.
	myC := x invarianzaC: c.
	
]

{ #category : #variance }
Main >> probandoVarianza [
	self casosNormales.
	self casosCovarianza.
	self casosContravarianza 
	
]
