/*
 * Copyright 2016-present the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.springframework.kafka.config;

/**
 * Configuration constants for internal sharing across subpackages.
 *
 * @author Juergen Hoeller
 * @author Gary Russell
 * @author Tomaz Fernandes
 */
public abstract class KafkaListenerConfigUtils {

	/**
	 * The bean name of the internally managed Kafka listener annotation processor.
	 */
	public static final String KAFKA_LISTENER_ANNOTATION_PROCESSOR_BEAN_NAME =
			"org.springframework.kafka.config.internalKafkaListenerAnnotationProcessor";

	/**
	 * The bean name of the internally managed Kafka listener endpoint registry.
	 */
	public static final String KAFKA_LISTENER_ENDPOINT_REGISTRY_BEAN_NAME =
			"org.springframework.kafka.config.internalKafkaListenerEndpointRegistry";

	/**
	 * The bean name of the internally managed Kafka consumer back off manager.
	 */
	public static final String KAFKA_CONSUMER_BACK_OFF_MANAGER_BEAN_NAME =
			"org.springframework.kafka.config.internalKafkaConsumerBackOffManager";

}
