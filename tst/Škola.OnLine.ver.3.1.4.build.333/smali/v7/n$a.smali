.class Lv7/n$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lv7/j;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lv7/n;->a(Lv7/o;Lv7/i;Ljava/lang/Runnable;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lv7/i;

.field final synthetic b:Lv7/o;


# direct methods
.method constructor <init>(Lv7/o;Lv7/i;)V
    .locals 0

    iput-object p1, p0, Lv7/n$a;->b:Lv7/o;

    iput-object p2, p0, Lv7/n$a;->a:Lv7/i;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()I
    .locals 1

    iget-object v0, p0, Lv7/n$a;->a:Lv7/i;

    iget v0, v0, Lv7/i;->c:I

    return v0
.end method

.method public b()Z
    .locals 1

    iget-object v0, p0, Lv7/n$a;->a:Lv7/i;

    invoke-virtual {v0}, Lv7/i;->D()Z

    move-result v0

    return v0
.end method
