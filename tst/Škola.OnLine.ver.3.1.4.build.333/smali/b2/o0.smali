.class public final Lb2/o0;
.super Ljava/io/IOException;
.source ""


# instance fields
.field public final n:Lt3/p;

.field public final o:Landroid/net/Uri;

.field public final p:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;>;"
        }
    .end annotation
.end field

.field public final q:J


# direct methods
.method public constructor <init>(Lt3/p;Landroid/net/Uri;Ljava/util/Map;JLjava/lang/Throwable;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lt3/p;",
            "Landroid/net/Uri;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;>;J",
            "Ljava/lang/Throwable;",
            ")V"
        }
    .end annotation

    invoke-direct {p0, p6}, Ljava/io/IOException;-><init>(Ljava/lang/Throwable;)V

    iput-object p1, p0, Lb2/o0;->n:Lt3/p;

    iput-object p2, p0, Lb2/o0;->o:Landroid/net/Uri;

    iput-object p3, p0, Lb2/o0;->p:Ljava/util/Map;

    iput-wide p4, p0, Lb2/o0;->q:J

    return-void
.end method
