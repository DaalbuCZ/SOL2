.class final Lv8/t$a;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lv8/t;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "a"
.end annotation


# instance fields
.field private final a:Landroid/content/Context;

.field private final b:Ll8/c;

.field private final c:Lv8/t$c;

.field private final d:Lv8/t$b;

.field private final e:Lio/flutter/view/d;


# direct methods
.method constructor <init>(Landroid/content/Context;Ll8/c;Lv8/t$c;Lv8/t$b;Lio/flutter/view/d;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lv8/t$a;->a:Landroid/content/Context;

    iput-object p2, p0, Lv8/t$a;->b:Ll8/c;

    iput-object p3, p0, Lv8/t$a;->c:Lv8/t$c;

    iput-object p4, p0, Lv8/t$a;->d:Lv8/t$b;

    iput-object p5, p0, Lv8/t$a;->e:Lio/flutter/view/d;

    return-void
.end method

.method static synthetic a(Lv8/t$a;)Lio/flutter/view/d;
    .locals 0

    iget-object p0, p0, Lv8/t$a;->e:Lio/flutter/view/d;

    return-object p0
.end method

.method static synthetic b(Lv8/t$a;)Ll8/c;
    .locals 0

    iget-object p0, p0, Lv8/t$a;->b:Ll8/c;

    return-object p0
.end method

.method static synthetic c(Lv8/t$a;)Lv8/t$b;
    .locals 0

    iget-object p0, p0, Lv8/t$a;->d:Lv8/t$b;

    return-object p0
.end method

.method static synthetic d(Lv8/t$a;)Lv8/t$c;
    .locals 0

    iget-object p0, p0, Lv8/t$a;->c:Lv8/t$c;

    return-object p0
.end method

.method static synthetic e(Lv8/t$a;)Landroid/content/Context;
    .locals 0

    iget-object p0, p0, Lv8/t$a;->a:Landroid/content/Context;

    return-object p0
.end method


# virtual methods
.method f(Lv8/t;Ll8/c;)V
    .locals 0

    invoke-static {p2, p1}, Lv8/n;->x(Ll8/c;Lv8/b$b;)V

    return-void
.end method

.method g(Ll8/c;)V
    .locals 1

    const/4 v0, 0x0

    invoke-static {p1, v0}, Lv8/n;->x(Ll8/c;Lv8/b$b;)V

    return-void
.end method
