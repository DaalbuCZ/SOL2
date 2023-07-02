.class public final Lio/flutter/plugins/imagepicker/g$k;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/flutter/plugins/imagepicker/g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "k"
.end annotation


# instance fields
.field private a:Lio/flutter/plugins/imagepicker/g$l;

.field private b:Lio/flutter/plugins/imagepicker/g$j;


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method static a(Ljava/util/ArrayList;)Lio/flutter/plugins/imagepicker/g$k;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Ljava/lang/Object;",
            ">;)",
            "Lio/flutter/plugins/imagepicker/g$k;"
        }
    .end annotation

    new-instance v0, Lio/flutter/plugins/imagepicker/g$k;

    invoke-direct {v0}, Lio/flutter/plugins/imagepicker/g$k;-><init>()V

    const/4 v1, 0x0

    invoke-virtual {p0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    const/4 v2, 0x0

    if-nez v1, :cond_0

    move-object v1, v2

    goto :goto_0

    :cond_0
    invoke-static {}, Lio/flutter/plugins/imagepicker/g$l;->values()[Lio/flutter/plugins/imagepicker/g$l;

    move-result-object v3

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    aget-object v1, v3, v1

    :goto_0
    invoke-virtual {v0, v1}, Lio/flutter/plugins/imagepicker/g$k;->e(Lio/flutter/plugins/imagepicker/g$l;)V

    const/4 v1, 0x1

    invoke-virtual {p0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p0

    if-nez p0, :cond_1

    goto :goto_1

    :cond_1
    invoke-static {}, Lio/flutter/plugins/imagepicker/g$j;->values()[Lio/flutter/plugins/imagepicker/g$j;

    move-result-object v1

    check-cast p0, Ljava/lang/Integer;

    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    move-result p0

    aget-object v2, v1, p0

    :goto_1
    invoke-virtual {v0, v2}, Lio/flutter/plugins/imagepicker/g$k;->d(Lio/flutter/plugins/imagepicker/g$j;)V

    return-object v0
.end method


# virtual methods
.method public b()Lio/flutter/plugins/imagepicker/g$j;
    .locals 1

    iget-object v0, p0, Lio/flutter/plugins/imagepicker/g$k;->b:Lio/flutter/plugins/imagepicker/g$j;

    return-object v0
.end method

.method public c()Lio/flutter/plugins/imagepicker/g$l;
    .locals 1

    iget-object v0, p0, Lio/flutter/plugins/imagepicker/g$k;->a:Lio/flutter/plugins/imagepicker/g$l;

    return-object v0
.end method

.method public d(Lio/flutter/plugins/imagepicker/g$j;)V
    .locals 0

    iput-object p1, p0, Lio/flutter/plugins/imagepicker/g$k;->b:Lio/flutter/plugins/imagepicker/g$j;

    return-void
.end method

.method public e(Lio/flutter/plugins/imagepicker/g$l;)V
    .locals 1

    if-eqz p1, :cond_0

    iput-object p1, p0, Lio/flutter/plugins/imagepicker/g$k;->a:Lio/flutter/plugins/imagepicker/g$l;

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Nonnull field \"type\" is null."

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method f()Ljava/util/ArrayList;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/ArrayList<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    new-instance v0, Ljava/util/ArrayList;

    const/4 v1, 0x2

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    iget-object v1, p0, Lio/flutter/plugins/imagepicker/g$k;->a:Lio/flutter/plugins/imagepicker/g$l;

    const/4 v2, 0x0

    if-nez v1, :cond_0

    move-object v1, v2

    goto :goto_0

    :cond_0
    invoke-static {v1}, Lio/flutter/plugins/imagepicker/g$l;->e(Lio/flutter/plugins/imagepicker/g$l;)I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    :goto_0
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object v1, p0, Lio/flutter/plugins/imagepicker/g$k;->b:Lio/flutter/plugins/imagepicker/g$j;

    if-nez v1, :cond_1

    goto :goto_1

    :cond_1
    invoke-static {v1}, Lio/flutter/plugins/imagepicker/g$j;->e(Lio/flutter/plugins/imagepicker/g$j;)I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    :goto_1
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-object v0
.end method
