.class final Lz2/f$b;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lz2/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# instance fields
.field public final a:Lz2/u;

.field public final b:Lz2/u$c;

.field public final c:Lz2/f$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lz2/f<",
            "TT;>.a;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lz2/u;Lz2/u$c;Lz2/f$a;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lz2/u;",
            "Lz2/u$c;",
            "Lz2/f<",
            "TT;>.a;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lz2/f$b;->a:Lz2/u;

    iput-object p2, p0, Lz2/f$b;->b:Lz2/u$c;

    iput-object p3, p0, Lz2/f$b;->c:Lz2/f$a;

    return-void
.end method
