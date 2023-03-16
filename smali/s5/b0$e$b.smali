.class public abstract Ls5/b0$e$b;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation build Lcom/google/auto/value/AutoValue$Builder;
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ls5/b0$e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "b"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public abstract a()Ls5/b0$e;
.end method

.method public abstract b(Ls5/b0$e$a;)Ls5/b0$e$b;
.end method

.method public abstract c(Z)Ls5/b0$e$b;
.end method

.method public abstract d(Ls5/b0$e$c;)Ls5/b0$e$b;
.end method

.method public abstract e(Ljava/lang/Long;)Ls5/b0$e$b;
.end method

.method public abstract f(Ls5/c0;)Ls5/b0$e$b;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ls5/c0<",
            "Ls5/b0$e$d;",
            ">;)",
            "Ls5/b0$e$b;"
        }
    .end annotation
.end method

.method public abstract g(Ljava/lang/String;)Ls5/b0$e$b;
.end method

.method public abstract h(I)Ls5/b0$e$b;
.end method

.method public abstract i(Ljava/lang/String;)Ls5/b0$e$b;
.end method

.method public j([B)Ls5/b0$e$b;
    .locals 2

    new-instance v0, Ljava/lang/String;

    invoke-static {}, Ls5/b0;->a()Ljava/nio/charset/Charset;

    move-result-object v1

    invoke-direct {v0, p1, v1}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V

    invoke-virtual {p0, v0}, Ls5/b0$e$b;->i(Ljava/lang/String;)Ls5/b0$e$b;

    move-result-object p1

    return-object p1
.end method

.method public abstract k(Ls5/b0$e$e;)Ls5/b0$e$b;
.end method

.method public abstract l(J)Ls5/b0$e$b;
.end method

.method public abstract m(Ls5/b0$e$f;)Ls5/b0$e$b;
.end method
