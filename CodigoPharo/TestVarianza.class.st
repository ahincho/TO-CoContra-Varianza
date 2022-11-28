Class {
	#name : #TestVarianza,
	#superclass : #TestCase,
	#category : #CodigoPharo
}

{ #category : #variance }
TestVarianza >> testVarianza [
	| m |
	m := Main new.
	m probandoVarianza 
]
