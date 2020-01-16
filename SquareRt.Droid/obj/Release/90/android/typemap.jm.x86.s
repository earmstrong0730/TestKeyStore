	/* Data SHA1: a5a824e0ea73ed35a72847a4d4ce01eaa1c1747a */
	.file	"typemap.jm.inc"

	/* Mapping header */
	.section	.data.jm_typemap,"aw",@progbits
	.type	jm_typemap_header, @object
	.p2align	2
	.global	jm_typemap_header
jm_typemap_header:
	/* version */
	.long	1
	/* entry-count */
	.long	1495
	/* entry-length */
	.long	264
	/* value-offset */
	.long	117
	.size	jm_typemap_header, 16

	/* Mapping data */
	.type	jm_typemap, @object
	.global	jm_typemap
jm_typemap:
	.size	jm_typemap, 394681
	.include	"typemap.jm.inc"
