.class public interface abstract Lz9/p1;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lj9/g$b;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lz9/p1$b;,
        Lz9/p1$a;
    }
.end annotation


# static fields
.field public static final m:Lz9/p1$b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget-object v0, Lz9/p1$b;->n:Lz9/p1$b;

    sput-object v0, Lz9/p1;->m:Lz9/p1$b;

    return-void
.end method


# virtual methods
.method public abstract G()Ljava/util/concurrent/CancellationException;
.end method

.method public abstract M(Ljava/util/concurrent/CancellationException;)V
.end method

.method public abstract a()Z
.end method

.method public abstract n(ZZLr9/l;)Lz9/y0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ZZ",
            "Lr9/l<",
            "-",
            "Ljava/lang/Throwable;",
            "Lg9/s;",
            ">;)",
            "Lz9/y0;"
        }
    .end annotation
.end method

.method public abstract p(Lz9/s;)Lz9/q;
.end method

.method public abstract start()Z
.end method
