const execute = require('../utils');

/*test('simple for', async () => {
    const x = 54;
    const y = 43;
    let result = await execute("testSimpleFor.wh", x, y);
    expect(result[0]).toEqual([x+y]);
});*/

/*
test('simple foreach', async () => {
    let result = await execute("testSimpleForeach.wh", "54");
    expect(result[0]).toEqual([0]);
});*/

test('inverse list foreach', async () => {
    let result = await execute("testForeachInverse.wh", "(cons a (cons b (cons c (cons d nil))))");    
    expect(result[0]).toEqual(["(cons d (cons c (cons b (cons a nil))))"]);
});

/*
test('simple while', async () => {
    let result = await execute("testSimpleWhile.wh", "(a)");
    expect(result[0]).toEqual([1]);
});
*/

test('for 1', async () => {
    let result = await execute("testFor1.wh", 12);
    expect(result[0]).toEqual(["nil"]);
});

test('for 2', async () => {
    let result = await execute("testFor2.wh", 12);
    expect(result[0]).toEqual([12]);
});

test('for 3', async () => {
    let result = await execute("testFor3.wh", 5);
    expect(result[0]).toEqual([25]);
});

test('simple foreach 1', async () => {
    let result = await execute("testSimpleForeach1.wh", 51);
    expect(result[0]).toEqual([0]);
});

test('simple foreach 2', async () => {
    let result = await execute("testSimpleForeach2.wh", "(list a b c d)");
    expect(result[0]).toEqual(["(cons d (cons c (cons b (cons a nil))))"]);
});

test('simple foreach 3', async () => {
    let result = await execute("testSimpleForeach3.wh", 51);
    expect(result[0]).toEqual([0]);
});