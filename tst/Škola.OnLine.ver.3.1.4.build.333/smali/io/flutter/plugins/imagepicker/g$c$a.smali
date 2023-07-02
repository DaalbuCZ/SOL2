.class public final Lio/flutter/plugins/imagepicker/g$c$a;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/flutter/plugins/imagepicker/g$c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field private a:Lio/flutter/plugins/imagepicker/g$d;

.field private b:Lio/flutter/plugins/imagepicker/g$b;

.field private c:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Lio/flutter/plugins/imagepicker/g$c;
    .locals 2

    new-instance v0, Lio/flutter/plugins/imagepicker/g$c;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lio/flutter/plugins/imagepicker/g$c;-><init>(Lio/flutter/plugins/imagepicker/g$a;)V

    iget-object v1, p0, Lio/flutter/plugins/imagepicker/g$c$a;->a:Lio/flutter/plugins/imagepicker/g$d;

    invoke-virtual {v0, v1}, Lio/flutter/plugins/imagepicker/g$c;->d(Lio/flutter/plugins/imagepicker/g$d;)V

    iget-object v1, p0, Lio/flutter/plugins/imagepicker/g$c$a;->b:Lio/flutter/plugins/imagepicker/g$b;

    invoke-virtual {v0, v1}, Lio/flutter/plugins/imagepicker/g$c;->b(Lio/flutter/plugins/imagepicker/g$b;)V

    iget-object v1, p0, Lio/flutter/plugins/imagepicker/g$c$a;->c:Ljava/util/List;

    invoke-virtual {v0, v1}, Lio/flutter/plugins/imagepicker/g$c;->c(Ljava/util/List;)V

    return-object v0
.end method

.method public b(Lio/flutter/plugins/imagepicker/g$b;)Lio/flutter/plugins/imagepicker/g$c$a;
    .locals 0

    iput-object p1, p0, Lio/flutter/plugins/imagepicker/g$c$a;->b:Lio/flutter/plugins/imagepicker/g$b;

    return-object p0
.end method

.method public c(Ljava/util/List;)Lio/flutter/plugins/imagepicker/g$c$a;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)",
            "Lio/flutter/plugins/imagepicker/g$c$a;"
        }
    .end annotation

    iput-object p1, p0, Lio/flutter/plugins/imagepicker/g$c$a;->c:Ljava/util/List;

    return-object p0
.end method

.method public d(Lio/flutter/plugins/imagepicker/g$d;)Lio/flutter/plugins/imagepicker/g$c$a;
    .locals 0

    iput-object p1, p0, Lio/flutter/plugins/imagepicker/g$c$a;->a:Lio/flutter/plugins/imagepicker/g$d;

    return-object p0
.end method
