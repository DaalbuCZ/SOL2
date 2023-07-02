.class final Lu3/e0$c;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lt3/h0$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lu3/e0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "c"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lt3/h0$b<",
        "Lt3/h0$e;",
        ">;"
    }
.end annotation


# instance fields
.field private final n:Lu3/e0$b;


# direct methods
.method public constructor <init>(Lu3/e0$b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lu3/e0$c;->n:Lu3/e0$b;

    return-void
.end method


# virtual methods
.method public m(Lt3/h0$e;JJLjava/io/IOException;I)Lt3/h0$c;
    .locals 0

    iget-object p1, p0, Lu3/e0$c;->n:Lu3/e0$b;

    if-eqz p1, :cond_0

    invoke-interface {p1, p6}, Lu3/e0$b;->b(Ljava/io/IOException;)V

    :cond_0
    sget-object p1, Lt3/h0;->f:Lt3/h0$c;

    return-object p1
.end method

.method public s(Lt3/h0$e;JJ)V
    .locals 0

    iget-object p1, p0, Lu3/e0$c;->n:Lu3/e0$b;

    if-eqz p1, :cond_1

    invoke-static {}, Lu3/e0;->k()Z

    move-result p1

    if-nez p1, :cond_0

    iget-object p1, p0, Lu3/e0$c;->n:Lu3/e0$b;

    new-instance p2, Ljava/io/IOException;

    new-instance p3, Ljava/util/ConcurrentModificationException;

    invoke-direct {p3}, Ljava/util/ConcurrentModificationException;-><init>()V

    invoke-direct {p2, p3}, Ljava/io/IOException;-><init>(Ljava/lang/Throwable;)V

    invoke-interface {p1, p2}, Lu3/e0$b;->b(Ljava/io/IOException;)V

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lu3/e0$c;->n:Lu3/e0$b;

    invoke-interface {p1}, Lu3/e0$b;->a()V

    :cond_1
    :goto_0
    return-void
.end method

.method public u(Lt3/h0$e;JJZ)V
    .locals 0

    return-void
.end method
