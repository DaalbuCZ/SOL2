.class public Lx1/v1$h;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lx1/v1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "h"
.end annotation


# instance fields
.field public final a:Landroid/net/Uri;

.field public final b:Ljava/lang/String;

.field public final c:Lx1/v1$f;

.field public final d:Lx1/v1$b;

.field public final e:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ly2/c;",
            ">;"
        }
    .end annotation
.end field

.field public final f:Ljava/lang/String;

.field public final g:Lg5/q;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lg5/q<",
            "Lx1/v1$l;",
            ">;"
        }
    .end annotation
.end field

.field public final h:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lx1/v1$k;",
            ">;"
        }
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field public final i:Ljava/lang/Object;


# direct methods
.method private constructor <init>(Landroid/net/Uri;Ljava/lang/String;Lx1/v1$f;Lx1/v1$b;Ljava/util/List;Ljava/lang/String;Lg5/q;Ljava/lang/Object;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/net/Uri;",
            "Ljava/lang/String;",
            "Lx1/v1$f;",
            "Lx1/v1$b;",
            "Ljava/util/List<",
            "Ly2/c;",
            ">;",
            "Ljava/lang/String;",
            "Lg5/q<",
            "Lx1/v1$l;",
            ">;",
            "Ljava/lang/Object;",
            ")V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lx1/v1$h;->a:Landroid/net/Uri;

    iput-object p2, p0, Lx1/v1$h;->b:Ljava/lang/String;

    iput-object p3, p0, Lx1/v1$h;->c:Lx1/v1$f;

    iput-object p5, p0, Lx1/v1$h;->e:Ljava/util/List;

    iput-object p6, p0, Lx1/v1$h;->f:Ljava/lang/String;

    iput-object p7, p0, Lx1/v1$h;->g:Lg5/q;

    invoke-static {}, Lg5/q;->D()Lg5/q$a;

    move-result-object p1

    const/4 p2, 0x0

    :goto_0
    invoke-virtual {p7}, Ljava/util/AbstractCollection;->size()I

    move-result p3

    if-ge p2, p3, :cond_0

    invoke-interface {p7, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Lx1/v1$l;

    invoke-virtual {p3}, Lx1/v1$l;->a()Lx1/v1$l$a;

    move-result-object p3

    invoke-static {p3}, Lx1/v1$l$a;->a(Lx1/v1$l$a;)Lx1/v1$k;

    move-result-object p3

    invoke-virtual {p1, p3}, Lg5/q$a;->f(Ljava/lang/Object;)Lg5/q$a;

    add-int/lit8 p2, p2, 0x1

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Lg5/q$a;->h()Lg5/q;

    move-result-object p1

    iput-object p1, p0, Lx1/v1$h;->h:Ljava/util/List;

    iput-object p8, p0, Lx1/v1$h;->i:Ljava/lang/Object;

    return-void
.end method

.method synthetic constructor <init>(Landroid/net/Uri;Ljava/lang/String;Lx1/v1$f;Lx1/v1$b;Ljava/util/List;Ljava/lang/String;Lg5/q;Ljava/lang/Object;Lx1/v1$a;)V
    .locals 0

    invoke-direct/range {p0 .. p8}, Lx1/v1$h;-><init>(Landroid/net/Uri;Ljava/lang/String;Lx1/v1$f;Lx1/v1$b;Ljava/util/List;Ljava/lang/String;Lg5/q;Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lx1/v1$h;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lx1/v1$h;

    iget-object v1, p0, Lx1/v1$h;->a:Landroid/net/Uri;

    iget-object v3, p1, Lx1/v1$h;->a:Landroid/net/Uri;

    invoke-virtual {v1, v3}, Landroid/net/Uri;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v1, p0, Lx1/v1$h;->b:Ljava/lang/String;

    iget-object v3, p1, Lx1/v1$h;->b:Ljava/lang/String;

    invoke-static {v1, v3}, Lu3/n0;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v1, p0, Lx1/v1$h;->c:Lx1/v1$f;

    iget-object v3, p1, Lx1/v1$h;->c:Lx1/v1$f;

    invoke-static {v1, v3}, Lu3/n0;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v1, p0, Lx1/v1$h;->d:Lx1/v1$b;

    iget-object v3, p1, Lx1/v1$h;->d:Lx1/v1$b;

    invoke-static {v1, v3}, Lu3/n0;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v1, p0, Lx1/v1$h;->e:Ljava/util/List;

    iget-object v3, p1, Lx1/v1$h;->e:Ljava/util/List;

    invoke-interface {v1, v3}, Ljava/util/List;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v1, p0, Lx1/v1$h;->f:Ljava/lang/String;

    iget-object v3, p1, Lx1/v1$h;->f:Ljava/lang/String;

    invoke-static {v1, v3}, Lu3/n0;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v1, p0, Lx1/v1$h;->g:Lg5/q;

    iget-object v3, p1, Lx1/v1$h;->g:Lg5/q;

    invoke-virtual {v1, v3}, Lg5/q;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v1, p0, Lx1/v1$h;->i:Ljava/lang/Object;

    iget-object p1, p1, Lx1/v1$h;->i:Ljava/lang/Object;

    invoke-static {v1, p1}, Lu3/n0;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    goto :goto_0

    :cond_2
    move v0, v2

    :goto_0
    return v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lx1/v1$h;->a:Landroid/net/Uri;

    invoke-virtual {v0}, Landroid/net/Uri;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lx1/v1$h;->b:Ljava/lang/String;

    const/4 v2, 0x0

    if-nez v1, :cond_0

    move v1, v2

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_0
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lx1/v1$h;->c:Lx1/v1$f;

    if-nez v1, :cond_1

    move v1, v2

    goto :goto_1

    :cond_1
    invoke-virtual {v1}, Lx1/v1$f;->hashCode()I

    move-result v1

    :goto_1
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lx1/v1$h;->e:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lx1/v1$h;->f:Ljava/lang/String;

    if-nez v1, :cond_2

    move v1, v2

    goto :goto_2

    :cond_2
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_2
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lx1/v1$h;->g:Lg5/q;

    invoke-virtual {v1}, Lg5/q;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lx1/v1$h;->i:Ljava/lang/Object;

    if-nez v1, :cond_3

    goto :goto_3

    :cond_3
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_3
    add-int/2addr v0, v2

    return v0
.end method
