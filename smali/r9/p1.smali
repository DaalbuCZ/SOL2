.class public interface abstract Lr9/p1;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lb9/g$b;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lr9/p1$b;,
        Lr9/p1$a;
    }
.end annotation


# static fields
.field public static final l:Lr9/p1$b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget-object v0, Lr9/p1$b;->n:Lr9/p1$b;

    sput-object v0, Lr9/p1;->l:Lr9/p1$b;

    return-void
.end method


# virtual methods
.method public abstract G()Ljava/util/concurrent/CancellationException;
.end method

.method public abstract N(Ljava/util/concurrent/CancellationException;)V
.end method

.method public abstract O(ZZLj9/l;)Lr9/y0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ZZ",
            "Lj9/l<",
            "-",
            "Ljava/lang/Throwable;",
            "Ly8/s;",
            ">;)",
            "Lr9/y0;"
        }
    .end annotation
.end method

.method public abstract a()Z
.end method

.method public abstract k(Lr9/s;)Lr9/q;
.end method

.method public abstract start()Z
.end method
