.class Ld1/o3$b;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ld1/o3;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "b"
.end annotation


# instance fields
.field private n:Landroid/view/View;

.field private o:Ld1/o3$a;

.field final synthetic p:Ld1/o3;


# direct methods
.method public constructor <init>(Ld1/o3;Landroid/view/View;Ld1/o3$a;)V
    .locals 0

    iput-object p1, p0, Ld1/o3$b;->p:Ld1/o3;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Ld1/o3$b;->n:Landroid/view/View;

    iput-object p3, p0, Ld1/o3$b;->o:Ld1/o3$a;

    return-void
.end method

.method private a(Landroid/view/View;)Ljava/util/List;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/view/View;",
            ")",
            "Ljava/util/List<",
            "Landroid/view/View;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Ld1/o3$b;->p:Ld1/o3;

    invoke-static {v0}, Ld1/o3;->a(Ld1/o3;)Ljava/util/List;

    move-result-object v0

    invoke-virtual {p1}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object p1

    return-object p1

    :cond_0
    instance-of v0, p1, Landroid/view/ViewGroup;

    if-eqz v0, :cond_3

    instance-of v0, p1, Landroid/widget/AdapterView;

    if-eqz v0, :cond_1

    goto :goto_1

    :cond_1
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    check-cast p1, Landroid/view/ViewGroup;

    const/4 v1, 0x0

    :goto_0
    invoke-virtual {p1}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v2

    if-ge v1, v2, :cond_2

    invoke-virtual {p1, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v2

    invoke-direct {p0, v2}, Ld1/o3$b;->a(Landroid/view/View;)Ljava/util/List;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_2
    return-object v0

    :cond_3
    :goto_1
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-object v0
.end method


# virtual methods
.method public run()V
    .locals 2

    iget-object v0, p0, Ld1/o3$b;->n:Landroid/view/View;

    invoke-direct {p0, v0}, Ld1/o3$b;->a(Landroid/view/View;)Ljava/util/List;

    move-result-object v0

    iget-object v1, p0, Ld1/o3$b;->o:Ld1/o3$a;

    if-eqz v1, :cond_0

    invoke-interface {v1, v0}, Ld1/o3$a;->a(Ljava/util/List;)V

    :cond_0
    const/4 v0, 0x0

    iput-object v0, p0, Ld1/o3$b;->o:Ld1/o3$a;

    return-void
.end method
