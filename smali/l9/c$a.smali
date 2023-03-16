.class public final Ll9/c$a;
.super Ll9/c;
.source ""

# interfaces
.implements Ljava/io/Serializable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ll9/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ll9/c;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lk9/g;)V
    .locals 0

    invoke-direct {p0}, Ll9/c$a;-><init>()V

    return-void
.end method


# virtual methods
.method public b()I
    .locals 1

    invoke-static {}, Ll9/c;->a()Ll9/c;

    move-result-object v0

    invoke-virtual {v0}, Ll9/c;->b()I

    move-result v0

    return v0
.end method
