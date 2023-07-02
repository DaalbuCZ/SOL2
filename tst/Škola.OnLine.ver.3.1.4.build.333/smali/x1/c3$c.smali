.class public final Lx1/c3$c;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lx1/c3;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "c"
.end annotation


# instance fields
.field private final a:Lu3/l;


# direct methods
.method public constructor <init>(Lu3/l;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lx1/c3$c;->a:Lu3/l;

    return-void
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 1

    if-ne p0, p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    instance-of v0, p1, Lx1/c3$c;

    if-nez v0, :cond_1

    const/4 p1, 0x0

    return p1

    :cond_1
    check-cast p1, Lx1/c3$c;

    iget-object v0, p0, Lx1/c3$c;->a:Lu3/l;

    iget-object p1, p1, Lx1/c3$c;->a:Lu3/l;

    invoke-virtual {v0, p1}, Lu3/l;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public hashCode()I
    .locals 1

    iget-object v0, p0, Lx1/c3$c;->a:Lu3/l;

    invoke-virtual {v0}, Lu3/l;->hashCode()I

    move-result v0

    return v0
.end method
