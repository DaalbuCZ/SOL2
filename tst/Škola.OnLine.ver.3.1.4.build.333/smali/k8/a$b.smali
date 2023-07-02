.class public Lk8/a$b;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lk8/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "b"
.end annotation


# instance fields
.field private final a:Landroid/content/Context;

.field private final b:Lio/flutter/embedding/engine/a;

.field private final c:Lt8/c;

.field private final d:Lio/flutter/view/d;

.field private final e:Lio/flutter/plugin/platform/h;

.field private final f:Lk8/a$a;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lio/flutter/embedding/engine/a;Lt8/c;Lio/flutter/view/d;Lio/flutter/plugin/platform/h;Lk8/a$a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lk8/a$b;->a:Landroid/content/Context;

    iput-object p2, p0, Lk8/a$b;->b:Lio/flutter/embedding/engine/a;

    iput-object p3, p0, Lk8/a$b;->c:Lt8/c;

    iput-object p4, p0, Lk8/a$b;->d:Lio/flutter/view/d;

    iput-object p5, p0, Lk8/a$b;->e:Lio/flutter/plugin/platform/h;

    iput-object p6, p0, Lk8/a$b;->f:Lk8/a$a;

    return-void
.end method


# virtual methods
.method public a()Landroid/content/Context;
    .locals 1

    iget-object v0, p0, Lk8/a$b;->a:Landroid/content/Context;

    return-object v0
.end method

.method public b()Lt8/c;
    .locals 1

    iget-object v0, p0, Lk8/a$b;->c:Lt8/c;

    return-object v0
.end method

.method public c()Lk8/a$a;
    .locals 1

    iget-object v0, p0, Lk8/a$b;->f:Lk8/a$a;

    return-object v0
.end method

.method public d()Lio/flutter/plugin/platform/h;
    .locals 1

    iget-object v0, p0, Lk8/a$b;->e:Lio/flutter/plugin/platform/h;

    return-object v0
.end method

.method public e()Lio/flutter/view/d;
    .locals 1

    iget-object v0, p0, Lk8/a$b;->d:Lio/flutter/view/d;

    return-object v0
.end method
