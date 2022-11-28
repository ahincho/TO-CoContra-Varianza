Class {
	#name : #Y,
	#superclass : #X,
	#category : #CodigoPharo
}

{ #category : #variance }
Y >> contraVarianzaBA: anB [
	^ super invarianzaA: anB
]

{ #category : #variance }
Y >> contraVarianzaCA: anC [
	^ super invarianzaA: anC
]

{ #category : #variance }
Y >> contraVarianzaCB: anC [
	^ super invarianzaB: anC
]

{ #category : #variance }
Y >> covarianzaAB: anB [
	^ super invarianzaA: anB
]

{ #category : #variance }
Y >> covarianzaAC: anC [
	^ super invarianzaA: anC
]

{ #category : #variance }
Y >> covarianzaBC: anC [
	^ super invarianzaB: anC
]
