.class public final Ld3/d$a;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ld3/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1c
    name = "a"
.end annotation


# instance fields
.field public final a:Lx1/n1;

.field public final b:Lg5/q;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lg5/q<",
            "Ld3/b;",
            ">;"
        }
    .end annotation
.end field

.field public final c:Ld3/k;

.field public final d:Ljava/lang/String;

.field public final e:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lb2/m$b;",
            ">;"
        }
    .end annotation
.end field

.field public final f:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Ld3/e;",
            ">;"
        }
    .end annotation
.end field

.field public final g:J

.field public final h:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ld3/e;",
            ">;"
        }
    .end annotation
.end field

.field public final i:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ld3/e;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lx1/n1;Ljava/util/List;Ld3/k;Ljava/lang/String;Ljava/util/ArrayList;Ljava/util/ArrayList;Ljava/util/List;Ljava/util/List;J)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lx1/n1;",
            "Ljava/util/List<",
            "Ld3/b;",
            ">;",
            "Ld3/k;",
            "Ljava/lang/String;",
            "Ljava/util/ArrayList<",
            "Lb2/m$b;",
            ">;",
            "Ljava/util/ArrayList<",
            "Ld3/e;",
            ">;",
            "Ljava/util/List<",
            "Ld3/e;",
            ">;",
            "Ljava/util/List<",
            "Ld3/e;",
            ">;J)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ld3/d$a;->a:Lx1/n1;

    invoke-static {p2}, Lg5/q;->F(Ljava/util/Collection;)Lg5/q;

    move-result-object p1

    iput-object p1, p0, Ld3/d$a;->b:Lg5/q;

    iput-object p3, p0, Ld3/d$a;->c:Ld3/k;

    iput-object p4, p0, Ld3/d$a;->d:Ljava/lang/String;

    iput-object p5, p0, Ld3/d$a;->e:Ljava/util/ArrayList;

    iput-object p6, p0, Ld3/d$a;->f:Ljava/util/ArrayList;

    iput-object p7, p0, Ld3/d$a;->h:Ljava/util/List;

    iput-object p8, p0, Ld3/d$a;->i:Ljava/util/List;

    iput-wide p9, p0, Ld3/d$a;->g:J

    return-void
.end method
