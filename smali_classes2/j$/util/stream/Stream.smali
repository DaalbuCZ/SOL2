.class public interface abstract Lj$/util/stream/Stream;
.super Ljava/lang/Object;

# interfaces
.implements Lj$/util/stream/h;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lj$/util/stream/h;"
    }
.end annotation


# virtual methods
.method public abstract a(Lj$/util/function/Consumer;)V
.end method

.method public abstract anyMatch(Lj$/util/function/Predicate;)Z
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lj$/util/function/Predicate<",
            "-TT;>;)Z"
        }
    .end annotation
.end method

.method public abstract b(Lj$/util/function/Function;)Lj$/util/stream/l0;
.end method

.method public abstract count()J
.end method

.method public abstract d(Lj$/util/function/Consumer;)V
.end method

.method public abstract distinct()Lj$/util/stream/Stream;
.end method

.method public abstract e(Lj$/util/function/A;Lj$/util/function/BiConsumer;Lj$/util/function/BiConsumer;)Ljava/lang/Object;
.end method

.method public abstract findAny()Lj$/util/k;
.end method

.method public abstract findFirst()Lj$/util/k;
.end method

.method public abstract g(Lj$/util/function/n;)[Ljava/lang/Object;
.end method

.method public abstract h(Lj$/util/function/Predicate;)Lj$/util/stream/Stream;
.end method

.method public abstract j(Lj$/util/function/C;)Lj$/util/stream/l0;
.end method

.method public abstract k(Lj$/util/function/Function;)Lj$/util/stream/Stream;
.end method

.method public abstract l(Lj$/util/stream/j;)Ljava/lang/Object;
.end method

.method public abstract limit(J)Lj$/util/stream/Stream;
.end method

.method public abstract m(Lj$/util/function/Function;)Lj$/util/stream/Stream;
.end method

.method public abstract max(Ljava/util/Comparator;)Lj$/util/k;
.end method

.method public abstract min(Ljava/util/Comparator;)Lj$/util/k;
.end method

.method public abstract n(Lj$/util/function/Consumer;)Lj$/util/stream/Stream;
.end method

.method public abstract o(Lj$/util/function/Predicate;)Z
.end method

.method public abstract p(Lj$/util/function/c;)Lj$/util/k;
.end method

.method public abstract q(Lj$/util/function/Function;)Lj$/util/stream/u0;
.end method

.method public abstract s(Lj$/util/function/Predicate;)Z
.end method

.method public abstract skip(J)Lj$/util/stream/Stream;
.end method

.method public abstract sorted()Lj$/util/stream/Stream;
.end method

.method public abstract sorted(Ljava/util/Comparator;)Lj$/util/stream/Stream;
.end method

.method public abstract t(Lj$/util/function/D;)Lj$/util/stream/u0;
.end method

.method public abstract toArray()[Ljava/lang/Object;
.end method

.method public abstract u(Ljava/lang/Object;Lj$/util/function/BiFunction;Lj$/util/function/c;)Ljava/lang/Object;
.end method

.method public abstract v(Lj$/util/function/B;)Lj$/util/stream/H;
.end method

.method public abstract w(Lj$/util/function/Function;)Lj$/util/stream/H;
.end method

.method public abstract z(Ljava/lang/Object;Lj$/util/function/c;)Ljava/lang/Object;
.end method
