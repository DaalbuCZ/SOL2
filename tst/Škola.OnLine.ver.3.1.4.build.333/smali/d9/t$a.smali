.class final Ld9/t$a;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ld9/t;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "a"
.end annotation


# instance fields
.field private final a:Landroid/content/Context;

.field private final b:Lt8/c;

.field private final c:Ld9/t$c;

.field private final d:Ld9/t$b;

.field private final e:Lio/flutter/view/d;


# direct methods
.method constructor <init>(Landroid/content/Context;Lt8/c;Ld9/t$c;Ld9/t$b;Lio/flutter/view/d;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ld9/t$a;->a:Landroid/content/Context;

    iput-object p2, p0, Ld9/t$a;->b:Lt8/c;

    iput-object p3, p0, Ld9/t$a;->c:Ld9/t$c;

    iput-object p4, p0, Ld9/t$a;->d:Ld9/t$b;

    iput-object p5, p0, Ld9/t$a;->e:Lio/flutter/view/d;

    return-void
.end method

.method static synthetic a(Ld9/t$a;)Lio/flutter/view/d;
    .locals 0

    iget-object p0, p0, Ld9/t$a;->e:Lio/flutter/view/d;

    return-object p0
.end method

.method static synthetic b(Ld9/t$a;)Lt8/c;
    .locals 0

    iget-object p0, p0, Ld9/t$a;->b:Lt8/c;

    return-object p0
.end method

.method static synthetic c(Ld9/t$a;)Ld9/t$b;
    .locals 0

    iget-object p0, p0, Ld9/t$a;->d:Ld9/t$b;

    return-object p0
.end method

.method static synthetic d(Ld9/t$a;)Ld9/t$c;
    .locals 0

    iget-object p0, p0, Ld9/t$a;->c:Ld9/t$c;

    return-object p0
.end method

.method static synthetic e(Ld9/t$a;)Landroid/content/Context;
    .locals 0

    iget-object p0, p0, Ld9/t$a;->a:Landroid/content/Context;

    return-object p0
.end method


# virtual methods
.method f(Ld9/t;Lt8/c;)V
    .locals 0

    invoke-static {p2, p1}, Ld9/n;->x(Lt8/c;Ld9/b$b;)V

    return-void
.end method

.method g(Lt8/c;)V
    .locals 1

    const/4 v0, 0x0

    invoke-static {p1, v0}, Ld9/n;->x(Lt8/c;Ld9/b$b;)V

    return-void
.end method
