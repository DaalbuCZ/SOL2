.class Ld1/o$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ld1/o3$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ld1/o;->b(Landroid/app/Activity;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroid/app/Activity;

.field final synthetic b:Ld1/o;


# direct methods
.method constructor <init>(Ld1/o;Landroid/app/Activity;)V
    .locals 0

    iput-object p1, p0, Ld1/o$a;->b:Ld1/o;

    iput-object p2, p0, Ld1/o$a;->a:Landroid/app/Activity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/util/List;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Landroid/view/View;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, Ld1/o$a;->b:Ld1/o;

    invoke-static {v0}, Ld1/o;->k(Ld1/o;)Ld1/y1;

    move-result-object v0

    new-instance v1, Ld1/o$a$a;

    invoke-direct {v1, p0, p1}, Ld1/o$a$a;-><init>(Ld1/o$a;Ljava/util/List;)V

    invoke-interface {v0, v1}, Ld1/y1;->a(Ljava/lang/Runnable;)V

    return-void
.end method
