.class public Lz3/v;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lx3/a$d;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lz3/v$a;
    }
.end annotation


# static fields
.field public static final b:Lz3/v;


# instance fields
.field private final a:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    invoke-static {}, Lz3/v;->c()Lz3/v$a;

    move-result-object v0

    invoke-virtual {v0}, Lz3/v$a;->a()Lz3/v;

    move-result-object v0

    sput-object v0, Lz3/v;->b:Lz3/v;

    return-void
.end method

.method synthetic constructor <init>(Ljava/lang/String;Lz3/y;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lz3/v;->a:Ljava/lang/String;

    return-void
.end method

.method public static c()Lz3/v$a;
    .locals 2

    new-instance v0, Lz3/v$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lz3/v$a;-><init>(Lz3/x;)V

    return-object v0
.end method


# virtual methods
.method public final d()Landroid/os/Bundle;
    .locals 3

    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    iget-object v1, p0, Lz3/v;->a:Ljava/lang/String;

    if-eqz v1, :cond_0

    const-string v2, "api"

    invoke-virtual {v0, v2, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    :cond_0
    return-object v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 1

    if-ne p1, p0, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    instance-of v0, p1, Lz3/v;

    if-nez v0, :cond_1

    const/4 p1, 0x0

    return p1

    :cond_1
    check-cast p1, Lz3/v;

    iget-object v0, p0, Lz3/v;->a:Ljava/lang/String;

    iget-object p1, p1, Lz3/v;->a:Ljava/lang/String;

    invoke-static {v0, p1}, Lz3/n;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public final hashCode()I
    .locals 3

    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/Object;

    iget-object v1, p0, Lz3/v;->a:Ljava/lang/String;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    invoke-static {v0}, Lz3/n;->b([Ljava/lang/Object;)I

    move-result v0

    return v0
.end method
