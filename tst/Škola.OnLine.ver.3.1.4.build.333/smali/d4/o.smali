.class public final Ld4/o;
.super Ld4/l;
.source ""


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<O::",
        "Lc4/a$d;",
        ">",
        "Ld4/l;"
    }
.end annotation


# instance fields
.field private final c:Lc4/e;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lc4/e<",
            "TO;>;"
        }
    .end annotation

    .annotation runtime Lorg/checkerframework/checker/initialization/qual/NotOnlyInitialized;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lc4/e;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lc4/e<",
            "TO;>;)V"
        }
    .end annotation

    const-string v0, "Method is not supported by connectionless client. APIs supporting connectionless client must not call this method."

    invoke-direct {p0, v0}, Ld4/l;-><init>(Ljava/lang/String;)V

    iput-object p1, p0, Ld4/o;->c:Lc4/e;

    return-void
.end method
