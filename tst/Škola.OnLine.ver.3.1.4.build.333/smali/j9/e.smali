.class public interface abstract Lj9/e;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lj9/g$b;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lj9/e$b;,
        Lj9/e$a;
    }
.end annotation


# static fields
.field public static final k:Lj9/e$b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget-object v0, Lj9/e$b;->n:Lj9/e$b;

    sput-object v0, Lj9/e;->k:Lj9/e$b;

    return-void
.end method


# virtual methods
.method public abstract V(Lj9/d;)Lj9/d;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lj9/d<",
            "-TT;>;)",
            "Lj9/d<",
            "TT;>;"
        }
    .end annotation
.end method

.method public abstract f(Lj9/d;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lj9/d<",
            "*>;)V"
        }
    .end annotation
.end method
