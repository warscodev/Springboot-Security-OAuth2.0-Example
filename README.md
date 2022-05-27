## 환경

> Spring Boot 2.7
> 
> H2
> 
> QueryDsl 5.0
> 
> ...

### QueryDsl 5.0 설정
```groovy
buildscript {
	ext {
		queryDslVersion = "5.0.0"
	}
}

...

dependencies {
        ...
	implementation 'com.querydsl:querydsl-jpa'

}

...
 
/** querydsl start  */
def querydslDir = "$buildDir/generated-source"
querydsl {
	jpa = true
	querydslSourcesDir = querydslDir
}
sourceSets {
	main.java.srcDir querydslDir
}
configurations {
	querydsl.extendsFrom compileClasspath
}
compileQuerydsl {
	options.annotationProcessorPath = configurations.querydsl
}
/** querydsl end  */
```

### Lombok 설정
> Preference → Build, Execution, Deployment → Compiler → Annotation  Processing → Enable annotation processing 체크
