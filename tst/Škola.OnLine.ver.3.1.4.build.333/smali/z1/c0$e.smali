.class public interface abstract Lz1/c0$e;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lz1/c0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x609
    name = "e"
.end annotation


# static fields
.field public static final a:Lz1/c0$e;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lz1/d0$a;

    invoke-direct {v0}, Lz1/d0$a;-><init>()V

    invoke-virtual {v0}, Lz1/d0$a;->g()Lz1/d0;

    move-result-object v0

    sput-object v0, Lz1/c0$e;->a:Lz1/c0$e;

    return-void
.end method


# virtual methods
.method public abstract a(IIIIIID)I
.end method
