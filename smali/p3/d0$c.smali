.class final Lp3/d0$c;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lo3/h0$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lp3/d0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "c"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lo3/h0$b<",
        "Lo3/h0$e;",
        ">;"
    }
.end annotation


# instance fields
.field private final n:Lp3/d0$b;


# direct methods
.method public constructor <init>(Lp3/d0$b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lp3/d0$c;->n:Lp3/d0$b;

    return-void
.end method


# virtual methods
.method public j(Lo3/h0$e;JJZ)V
    .locals 0

    return-void
.end method

.method public o(Lo3/h0$e;JJ)V
    .locals 0

    iget-object p1, p0, Lp3/d0$c;->n:Lp3/d0$b;

    if-eqz p1, :cond_1

    invoke-static {}, Lp3/d0;->k()Z

    move-result p1

    if-nez p1, :cond_0

    iget-object p1, p0, Lp3/d0$c;->n:Lp3/d0$b;

    new-instance p2, Ljava/io/IOException;

    new-instance p3, Ljava/util/ConcurrentModificationException;

    invoke-direct {p3}, Ljava/util/ConcurrentModificationException;-><init>()V

    invoke-direct {p2, p3}, Ljava/io/IOException;-><init>(Ljava/lang/Throwable;)V

    invoke-interface {p1, p2}, Lp3/d0$b;->b(Ljava/io/IOException;)V

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lp3/d0$c;->n:Lp3/d0$b;

    invoke-interface {p1}, Lp3/d0$b;->a()V

    :cond_1
    :goto_0
    return-void
.end method

.method public u(Lo3/h0$e;JJLjava/io/IOException;I)Lo3/h0$c;
    .locals 0

    iget-object p1, p0, Lp3/d0$c;->n:Lp3/d0$b;

    if-eqz p1, :cond_0

    invoke-interface {p1, p6}, Lp3/d0$b;->b(Ljava/io/IOException;)V

    :cond_0
    sget-object p1, Lo3/h0;->f:Lo3/h0$c;

    return-object p1
.end method