/*
 * The MIT License
 *
 *  Copyright (c) 2015, Mahmoud Ben Hassine (mahmoud@benhassine.fr)
 *
 *  Permission is hereby granted, free of charge, to any person obtaining a copy
 *  of this software and associated documentation files (the "Software"), to deal
 *  in the Software without restriction, including without limitation the rights
 *  to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 *  copies of the Software, and to permit persons to whom the Software is
 *  furnished to do so, subject to the following conditions:
 *
 *  The above copyright notice and this permission notice shall be included in
 *  all copies or substantial portions of the Software.
 *
 *  THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 *  IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 *  FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 *  AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 *  LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 *  OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 *  THE SOFTWARE.
 */

package org.easybatch.core.processor;

import org.easybatch.core.record.Record;

/**
 * A record processor performs some business logic on input records and produces output records.
 * The output record may be of another type of the input record and will be piped out to the next processor if any.
 *
 * @param <I> The input record type.
 * @param <O> The output record type.
 * @author Mahmoud Ben Hassine (mahmoud@benhassine.fr)
 */
public interface RecordProcessor<I extends Record, O extends Record> {

    /**
     * Process a record.
     *
     * @param record the record to process.
     * @return the processed record, may be of another type of the input record
     * @throws RecordProcessingException thrown if an exception occurs during record processing
     */
    O processRecord(I record) throws RecordProcessingException;

}
