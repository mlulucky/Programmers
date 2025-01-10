function solution(money) {
    const coffeePrice = 5500;
    const count = Math.floor(money / coffeePrice);
    return [count, money - (coffeePrice*count)];
}