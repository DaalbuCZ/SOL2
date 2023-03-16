.class public Lv8/b$h$a;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lv8/b$h;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# instance fields
.field private a:Ljava/lang/Long;

.field private b:Ljava/lang/Long;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Lv8/b$h;
    .locals 2

    new-instance v0, Lv8/b$h;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lv8/b$h;-><init>(Lv8/b$a;)V

    iget-object v1, p0, Lv8/b$h$a;->a:Ljava/lang/Long;

    invoke-virtual {v0, v1}, Lv8/b$h;->e(Ljava/lang/Long;)V

    iget-object v1, p0, Lv8/b$h$a;->b:Ljava/lang/Long;

    invoke-virtual {v0, v1}, Lv8/b$h;->d(Ljava/lang/Long;)V

    return-object v0
.end method

.method public b(Ljava/lang/Long;)Lv8/b$h$a;
    .locals 0

    iput-object p1, p0, Lv8/b$h$a;->b:Ljava/lang/Long;

    return-object p0
.end method

.method public c(Ljava/lang/Long;)Lv8/b$h$a;
    .locals 0

    iput-object p1, p0, Lv8/b$h$a;->a:Ljava/lang/Long;

    return-object p0
.end method
