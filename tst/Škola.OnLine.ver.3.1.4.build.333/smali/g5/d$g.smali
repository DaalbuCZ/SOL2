.class Lg5/d$g;
.super Lg5/d$k;
.source ""

# interfaces
.implements Ljava/util/RandomAccess;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lg5/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "g"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lg5/d<",
        "TK;TV;>.k;",
        "Ljava/util/RandomAccess;"
    }
.end annotation


# direct methods
.method constructor <init>(Lg5/d;Ljava/lang/Object;Ljava/util/List;Lg5/d$j;)V
    .locals 0
    .param p3    # Ljava/util/List;
        .annotation runtime Ljavax/annotation/CheckForNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TK;",
            "Ljava/util/List<",
            "TV;>;",
            "Lg5/d<",
            "TK;TV;>.j;)V"
        }
    .end annotation

    invoke-direct {p0, p1, p2, p3, p4}, Lg5/d$k;-><init>(Lg5/d;Ljava/lang/Object;Ljava/util/List;Lg5/d$j;)V

    return-void
.end method
